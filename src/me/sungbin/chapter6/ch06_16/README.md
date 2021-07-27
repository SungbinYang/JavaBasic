# 16. 여러가지 보조 스트림 클래스들

## 보조 스트림

- 실제 읽고 쓰는 스트림이 아닌 보조 기능을 제공하는 스트림

- FilterInputStream과 FilterOutputStream이 보조 스트림의 상위 클래스들

- 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가짐

- Decorator Pattern으로 구현 됨

- 상위 클래스 생성자

| 생성자 | 설명 |
| ------ | ------ |
| protected FilterInputStream과(InputStream in) | 생성자의 매개변수로 InputStream을 받습니다. |
| public FilterOutputStream(OutputStream out) | 생성자의 매개변수로 OutputStream을 받습니다. |

![deco](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter6/6-16/img/decostream.png)

### InputStreamReader와 OutputStreamWriter

- 바이트 단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조 스트림

- FileInputStream으로 읽은 자료를 문자로 변환해주는 예

``` java
package me.sungbin.chapter6.ch06_16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
            int i;

            while ((i = isr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

### BufferedInputStream과 BufferedOutputStream

- 약 8k의 배열이 제공되어 입출력이 빠르게 하는 기능이 제공되는 보조 스트림

- BufferedReader와 BufferedWriter는 문자용 입출력 보조 스트림

- BufferedInputStream과 BufferedOutputStream을 이용하여 파일 복사하는 예

``` java
package me.sungbin.chapter6.ch06_16;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {
    public static void main(String[] args) {

        long millisecond = 0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
            millisecond = System.currentTimeMillis();
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(millisecond + " 소요되었습니다.");

        Socket socket = new Socket();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

```

### DataInputStream과 DataOutputStream

- 자료가 메모리에 저장된 상태 그대로 읽거나 쓰는 스트림

- DataInputStream 메서드

![datain](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter6/6-16/img/datainput.png)

- DataOutputStream 메서드

![dataout](https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter6/6-16/img/dataoutput.png)

``` java
public class DataStreamTest {

	public static void main(String[] args) {


		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos))
		{
		
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis))
		{
		
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
```