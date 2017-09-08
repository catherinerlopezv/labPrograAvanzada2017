##Documentación

#Main
public class HelloWorld {
    public static void main(String... argvs) {
       Shape a1, b1,c1;
       a1=new Rectangle(10,10);
       System.out.println(a1.toString());
       
       
       b1= new Triangle(10,4);
       System.out.println(b1.toString());
       
       c1= new Rectangle(5,5);
      System.out.println( c1.toString());
       
       Rectangle re1;
      re1=(Rectangle)c1;
        System.out.println( c1.toString());
        
       c1= new Rectangle(10,2);
      System.out.println( c1.toString());
      
      Rectangle re2;
      re2=(Rectangle)c1;
       
    }
}
#Class Shape
public interface Shape {
    public double getArea();
    public String toString();
}

#Class Rectangle
public class Rectangle implements Shape{
    
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    
    public double getArea(){
        return this.width * this.length;
    }
    public String toString(){
        return "Rectangel[ width "+this.width+" length "+this.length+" area "+this.getArea()+"]";
    }
    
}

#Class Triangle
public class Triangle implements Shape{
    
    public double base;
    private double heigth;
    public Triangle(double base, double heigth){
        this.base = base;
        this.heigth=heigth;
        
    }
    public double getArea(){
        return(base*heigth)/2;
        
    }
    public String toString(){
        return "Triangle[base "+this.base+" heigth "+this.heigth+" area "+this.getArea()+"]";
        
    }
}


#Proyecto Corrido 
mvn -f /projects/console-java-simple clean install java -jar /projects/console-java-simple/target/*.jar
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building hello-app 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ console-java-simple ---
[INFO] Deleting /projects/console-java-simple/target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ console-java-simple ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /projects/console-java-simple/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ console-java-simple ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 4 source files to /projects/console-java-simple/target/classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ console-java-simple ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /projects/console-java-simple/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ console-java-simple ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /projects/console-java-simple/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ console-java-simple ---
[INFO] Surefire report directory: /projects/console-java-simple/target/surefire-reports
 
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.codenvy.example.java.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.058 sec
 
Results :
 
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
 
[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ console-java-simple ---
[INFO] Building jar: /projects/console-java-simple/target/console-java-simple-1.0-SNAPSHOT.jar
[INFO] 
[INFO] --- maven-install-plugin:2.4:install (default-install) @ console-java-simple ---
[INFO] Installing /projects/console-java-simple/target/console-java-simple-1.0-SNAPSHOT.jar to /home/user/.m2/repository/org/eclipse/che/examples/console-java-simple/1.0-SNAPSHOT/console-java-simple-1.0-SNAPSHOT.jar
[INFO] Installing /projects/console-java-simple/pom.xml to /home/user/.m2/repository/org/eclipse/che/examples/console-java-simple/1.0-SNAPSHOT/console-java-simple-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.090 s
[INFO] Finished at: 2017-09-08T16:27:41+00:00
[INFO] Final Memory: 14M/256M
[INFO] ------------------------------------------------------------------------
Rectangel[ width 10.0 length 10.0 area 100.0]
Triangle[base 10.0 heigth 4.0 area 20.0]
Rectangel[ width 5.0 length 5.0 area 25.0]
Rectangel[ width 5.0 length 5.0 area 25.0]
Rectangel[ width 10.0 length 2.0 area 20.0]
Projects Explorer 
console-java-simple
(master)
src
main
java
org.eclipse.che.examples
HelloWorld.java
Rectangle.java
Shape.java
Triangle.java
test
target
README.md
pom.xml
External Libraries

HelloWorldHelloWorldHelloWorld
1
2
3
4
   
