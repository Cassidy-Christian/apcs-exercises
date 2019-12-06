class Weight
{
  private int[] data;

  public Weight(int[] init)
  {
    data = new int[init.length];

    for (int j = 0; j < init.length; j++)
    {
      data[j] = init[j];
    }

    System.out.println("Data: "+toString());
    System.out.println("Average: " + this.average());
    System.out.println("Average between days 5 and 25: " + subAverage(5,25));
  }

  public String toString(){
    String dataString = "";
    for(int i = 0; i < data.length; i++) {
      dataString += (data[i] + ", ");
    }
    return dataString;
  }

  public int average() {
    int avg = 0;
    int t = 0;
    if(data==null){
        System.out.println("Data was null");
        return -1;
    }
    for(int i = 0; i < data.length; i++) {
      avg += data[i];
      t++;
    }
    return avg / t;
  }


  public int subAverage(int start, int end) {
    int average = 0;
    int t = 0;
    for(int i = start; i < (end - (start - 1)); i++) {
      average += data[i];
      t++;
    }
        return average / t;
  }
}