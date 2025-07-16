import java.io.*;
class Data{
  String name="jamuna";
int id=99;
Data(String name,int id){
  this.name = name;
this.id = id;
}
}
public class parameterized{
  public static void main(String[] args){
     Data data=new Data("maha",101);
     System.out.println("name: "+data.name+"and Id :"+data.id);
  
}
}