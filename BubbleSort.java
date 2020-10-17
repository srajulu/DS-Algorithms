
public class BubbleSort{
  
  public void sort(int [], array){
    
    for(var i=0; i<array.length; i++)
      for(var j=i+1;j<array.length;j++)
        if(array[j]<array[i]){
          var temp = array[j];
          var array[j] = array[i];
          var array[i] = temp;
        }
  }



 private void swap(int[] array, int index1,int index2){






  }
}
