
public class BubbleSort{
  
  public void sort(int [], array){
    
    for(var i=0; i<array.length; i++)
      for(var j=i+1;j<array.length;j++)
        if(array[j]<array[i])
          swap(array, j, i);
  }

  private void swap(int[] array, int index1,int index2){

    var temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;


  }
}
