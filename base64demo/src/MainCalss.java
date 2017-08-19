import java.util.Base64;

public class MainCalss {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getEncoder();
		Base64.Decoder decoder = Base64.getDecoder();

		System.out.println("\n ****************Plain String *****************\n");
		String encodedStr = encoder.encodeToString("Java8Changes".getBytes());
		String decodedStr = new String(decoder.decode(encodedStr));
		System.out.println("Encoded string: " + encodedStr + "\n" + "Decoded string: " + decodedStr);

		System.out.println("\n*************URL****************\n");
		encoder = Base64.getUrlEncoder();
		decoder = Base64.getUrlDecoder();
		String url = "http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html";
		String encodedURL = encoder.encodeToString(url.getBytes());
		String decodedUrl = new String(decoder.decode(encodedURL));
		System.out.println("Encoded URL: " + encodedURL + "\n" + "Decoded URL: " + decodedUrl);

		
		System.out.println("\n*************Mime Encoding and decoding****************\n");
		encoder = Base64.getMimeEncoder();
		decoder = Base64.getMimeDecoder();
		String message = "Hello, \nThis is Narasimha regarding Java 8";
		String enocdedMime = encoder.encodeToString(message.getBytes());
		String decodedMime = new String(decoder.decode(enocdedMime));
		System.out.println("Encoded MIME message: " + enocdedMime + "\n" + "Decoded message: " + decodedMime);
	}

}
