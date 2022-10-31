import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import CEscola.Aluno;
import CEscola.Professor;

public class App{
    public static void main(String[] args) throws Exception {
        gravaraluno();
        gravarprofessor();
        leraluno();
        lerprofessor();
        System.out.println("ola");

    }
    private static void gravaraluno(){
        Aluno aluno = new Aluno("Andre", "123456", "Cleto");
        try( ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("Aluno.txt"))){

            obj.writeObject(aluno);
        
        } catch(IOException e){
            e.printStackTrace();
        }

    }
    private static void gravarprofessor(){
        Professor professor = new Professor("Bruno", "147258", "Cleto");
        try(ObjectOutputStream objp = new ObjectOutputStream(new FileOutputStream("Professor.txt"))){
    
            objp.writeObject(professor);



        } catch(IOException e){
            e.printStackTrace();
        }
    }
    private static void leraluno(){
        try(ObjectInputStream objler = new ObjectInputStream(new FileInputStream("Aluno.txt"))){
            Aluno aluno = (Aluno) objler.readObject();
            System.out.println(aluno);
            objler.close();
        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void lerprofessor(){
        try(ObjectInputStream objpler = new ObjectInputStream(new FileInputStream("Professor.txt"))){
            Professor professor = (Professor)objpler.readObject();
            System.out.println(professor);
            objpler.close();

        } catch(IOException e){
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}