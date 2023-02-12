import java.io.*;
import java.util.ArrayList;

public class Main{
	
  public static void main(String[] args) {
    try {
      mn();
    } catch (Exception e) {
      // TODO: handle exception
    }
  
}

static void mn() throws Exception{
  File file = new File("pwds.txt");
  file.createNewFile();

FileWriter writer = new FileWriter(file);
//Ziffer 3
/*for(int a = 0; a < 62; a++){
for(int b = 0; b < 62; b++){
  for(int c = 0; c < 62; c++){
             writer.write(new String("" + Ziffer(a) + Ziffer(b) + Ziffer(c) + "\n"));
            }
          }
        }
*/

//Ziffer 8
for(int a = 0; a < 62; a++){
for(int b = 0; b < 62; b++){
  for(int c = 0; c < 62; c++){
    for(int d = 0; d < 62; d++){
      for(int e = 0; e < 62; e++){
        for(int f = 0; f < 62; f++){
          for(int g = 0; g < 62; g++){
            for(int h = 0; h < 62; h++){
              /*System.out.print(Ziffer(a));
              System.out.print(Ziffer(b));
              System.out.print(Ziffer(c));
              System.out.print(Ziffer(d));
              System.out.print(Ziffer(e));
              System.out.print(Ziffer(f));
              System.out.print(Ziffer(g));
              System.out.println(Ziffer(h));*/
              writer.write(new String("" + Ziffer(a) + Ziffer(b) + Ziffer(c) + Ziffer(d) + Ziffer(e) + Ziffer(f) + Ziffer(g) + Ziffer(h) + "\n"));
            }
          }
        }
      }
    }
  }
}
}


//Ziffer 9
for(int a = 0; a < 62; a++){
for(int b = 0; b < 62; b++){
  for(int c = 0; c < 62; c++){
    for(int d = 0; d < 62; d++){
      for(int e = 0; e < 62; e++){
        for(int f = 0; f < 62; f++){
          for(int g = 0; g < 62; g++){
            for(int h = 0; h < 62; h++){
              for(int i = 0; i < 62; i++){
                writer.write(new String("" + Ziffer(a) + Ziffer(b) + Ziffer(c) + Ziffer(d) + Ziffer(e) + Ziffer(f) + Ziffer(g) + Ziffer(h) + Ziffer(i) + "\n"));
            }
          }
        }
      }
    }
  }
}
}
}


//Ziffer 10
for(int a = 0; a < 62; a++){
for(int b = 0; b < 62; b++){
  for(int c = 0; c < 62; c++){
    for(int d = 0; d < 62; d++){
      for(int e = 0; e < 62; e++){
        for(int f = 0; f < 62; f++){
          for(int g = 0; g < 62; g++){
            for(int h = 0; h < 62; h++){
              for(int i = 0; i < 62; i++){
                for(int j = 0; j < 62; j++){
                  writer.write(new String("" + Ziffer(a) + Ziffer(b) + Ziffer(c) + Ziffer(d) + Ziffer(e) + Ziffer(f) + Ziffer(g) + Ziffer(h) + Ziffer(i) + Ziffer(j) + "\n"));
            }
          }
        }
      }
    }
  }
}
}
}
}
writer.close();
}

public static char Ziffer(int index) {
  ArrayList<Character> al = new ArrayList<Character>();

  //Zahlen 0-9
  for (int i=0; i<=9; i++) {
    //System.out.println(i);
    al.add((char)  ((char)48 +i));
  }
  //Großbuchstaben
  char x = 65;
  for (int j=0; j<26; j++) {
    //System.out.println(x);
    al.add(x);
    x++;
  }
  //Kleinbuchstaben
  char y = 97;
  for (int j=0; j<26; j++) {
    //System.out.println(y);
    al.add(y);
    y++;
  }
  
  return al.get(index);
}

}
