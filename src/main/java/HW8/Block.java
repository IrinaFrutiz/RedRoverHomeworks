package HW8;

public class Block {

    int width;
    int length;
    int height;

    public Block(int[] arr){
        width = arr[0];
        length = arr[1];
        height = arr[2];
    }

    public int getWidth(){
        return width;
    }

    public int getLength(){
        return length;
    }

    public int getHeight(){
        return height;
    }

    public int getVolume(){
        return width * height * length;
    }

    public int getSurfaceArea(){
        return 2 * (width * length + length * height + width * height);
    }

}
