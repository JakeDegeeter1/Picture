
public class PictureExercise
{
    public static void main(String[] args)
    {    	
        // If you want to not have to pick the image each time, fill in the correct address in the next line and delete the "//" 
        // Picture clouds = new Picture("C:\\Pictures\\...");
        Picture myPicture = new Picture("C:\\CS\\JakeDeGeeter\\download.jpg");
        
        // Use Picture methods to draw your picture object HERE
        myPicture.draw();
        myPicture.grow(1,4);
        
        
        // Use Picture methods & print\println to print out the height and width of your picture HERE
        System.out.println(myPicture.getMaxX());
        System.out.println(myPicture.getMaxY());
      
        
    }
}
