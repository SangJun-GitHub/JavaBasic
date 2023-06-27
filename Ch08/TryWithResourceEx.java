package Ch08;

/**
 * Created by Sang Jun Park on 6/5/2023.
 * Github : http://github.com/SangJun-GitHub
 */
class CloseableResource implements AutoCloseable{
    public void exceptionWork(boolean exception) throws WorkException{
        System.out.println("exceptionWork("+exception+") are called");
        if(exception)
            throw new WorkException("WorkException occur");
    }
    public void close() throws CloseException{
        System.out.println("close() are called");
        throw new CloseException("CloseException occur");
    }
}
class WorkException extends Exception{
    WorkException(String msg){
        super(msg);
    }
}
class CloseException extends Exception{
    CloseException(String msg){
        super(msg);
    }
}
public class TryWithResourceEx {
    public static void main(String[] args) {
        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(false);
        }catch (WorkException e){
            e.printStackTrace();
        }catch (CloseException e){
            e.printStackTrace();
        }

        System.out.println();

        try(CloseableResource cr = new CloseableResource()){
            cr.exceptionWork(true);
        }catch(WorkException e){
            e.printStackTrace();
        }catch(CloseException e){
            e.printStackTrace();
        }
    }
}
