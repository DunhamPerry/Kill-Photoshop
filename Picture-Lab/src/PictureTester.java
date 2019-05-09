/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("snowman.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void keepBlue()
  {
	  Picture dog = new Picture("dog.jpg");
	  dog.explore();
	  dog.keepBlue();
	  dog.explore();
  }
  
  public static void negate()
  {
	  Picture dog = new Picture("dog.jpg");
	  dog.explore();
	  dog.negate();
	  dog.explore();
  }
  
  public static void grayscale()
	  {
		  Picture dog = new Picture("dog.jpg");
		  dog.explore();
		  dog.grayscale();
		  dog.explore();
	  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("seagull.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("dog.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("dog.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorHorizontal(){
	  Picture dog = new Picture("dog.jpg");
	    dog.explore();
	    dog.mirrorHorizontal();
	    dog.explore();
  }
  
  public static void testMirrorHorizontalBotToTop(){
	  Picture dog = new Picture("dog.jpg");
	    dog.explore();
	    dog.mirrorHorizontalBotToTop();
	    dog.explore();
  }
  
  public static void testMirrorDiagonal(){
	  Picture dog = new Picture("dog.jpg");
	    dog.explore();
	    dog.mirrorDiagonal();
	    dog.explore();
  }
  
  public static void testMirrorArms(){
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//testMirrorDiagonal();
	//negate();
	//grayscale();
	//keepBlue();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}