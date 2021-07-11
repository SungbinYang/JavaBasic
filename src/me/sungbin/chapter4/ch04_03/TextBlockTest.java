package me.sungbin.chapter4.ch04_03;

public class TextBlockTest {
    public static void main(String[] args) {

        String textBlock = """
                Hello,
                hi,
                how r u
                """;
        System.out.println(textBlock);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
		            <html>
		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";
    }
}
