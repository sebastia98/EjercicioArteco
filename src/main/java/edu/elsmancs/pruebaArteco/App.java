package edu.elsmancs.pruebaArteco;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String loren = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam at ante libero. Nam blandit tincidunt tristique. Vivamus non porta nisl, non sodales sapien. Aliquam sodales ipsum ac facilisis porttitor. Donec enim sem, mattis eu erat sollicitudin, tempus vulputate turpis. Sed ultricies elit ac enim consequat posuere. Integer eget tempus eros, vel interdum ex. Aenean odio justo, ultrices accumsan magna non, aliquam semper libero. In vel lacinia diam. Nam vel tellus ultricies tellus viverra pulvinar. Integer non vehicula orci, a iaculis augue.\n\n" + 
    			"Nullam interdum non arcu at gravida. Praesent aliquam tincidunt iaculis. Pellentesque a sagittis nibh, ac fermentum nunc. Nullam sit amet tempor mi. Suspendisse tempus mi eros, sed consectetur ex aliquam in. Sed a nisl dui. Phasellus porta imperdiet dignissim. Proin tempor nunc orci, quis tristique felis euismod quis. Duis euismod rutrum magna, sed aliquam dolor. Praesent rhoncus quis mauris quis faucibus. Curabitur efficitur turpis mi, sit amet vulputate diam feugiat sit amet. Vivamus luctus elit odio, varius maximus ante facilisis hendrerit. Pellentesque id orci id orci maximus pharetra vel eu tortor.\n\n" + 
    			"Fusce ac mi nec metus suscipit blandit. Curabitur cursus, neque quis dignissim dictum, arcu ipsum pulvinar est, at mollis mi mauris a purus. Maecenas elit mi, volutpat eget bibendum eget, eleifend et elit. Etiam pulvinar turpis eget elit venenatis auctor. Nulla rhoncus sodales nisi, at molestie sapien egestas sagittis. Aliquam tellus dolor, rutrum ac neque nec, euismod tincidunt tellus. Etiam id ultrices massa. Nulla vehicula cursus mauris ac scelerisque. Proin rhoncus nunc est, vitae tincidunt est posuere in. Vestibulum mollis pulvinar nisl, id fringilla augue venenatis ut. Fusce ullamcorper mollis dolor, a pharetra ex fermentum laoreet.\n\n" + 
    			"Proin eu enim laoreet, aliquet risus quis, tincidunt mi. Proin id elit non lorem fringilla efficitur gravida sit amet nulla. Mauris non tortor velit. Curabitur ligula libero, blandit vel aliquet vitae, aliquet eu magna. Cras faucibus tellus non orci facilisis, et gravida tortor pellentesque. Suspendisse volutpat aliquam fermentum. Nulla placerat sed ipsum hendrerit convallis. Suspendisse potenti. Nunc pulvinar lectus magna, in pellentesque lectus posuere eu. Nam et bibendum est.\n\n" + 
    			"Maecenas gravida ex ac ex cursus, vel viverra tortor efficitur. Suspendisse porttitor ligula tortor, vel aliquet dolor porttitor eu. Nam id pharetra lacus. In sollicitudin consequat tristique. Quisque fermentum turpis orci, in convallis augue aliquet sed. Proin aliquam lacus quam, ac imperdiet libero iaculis consectetur. Vivamus convallis nunc in finibus tristique. Vivamus eget tortor varius, convallis nisl eu, vulputate ante. Cras in cursus sem, a interdum risus.";
    	//String loren = "A ver si asi se da mas prisa, a ver.Tengo que meter mas palabras. A ver a ver, tengo que ahora no, meter mas ahora mas palabras";
    	Counter contador = new Counter(loren);
    	System.out.println(contador.toString());
    	
    	
    }
}
