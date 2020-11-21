package com.javatpoint;  
import java.util.*;
import javax.persistence.TypedQuery;
import org.hibernate.*;
import org.hibernate.cfg.Configuration; 
  
public class FetchData {  
public static void main(String[] args) {  
      
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
    
	Session session = factory.openSession();
      
    Query query=session.createQuery("from Question");  
    List<Question> list=query.list();  
      
    Iterator<Question> itr=list.iterator();  
    while(itr.hasNext()){  
        Question q=itr.next();  
        System.out.println("Question Name: "+q.getQname());  
          
        //printing answers  
        List<Answer> list2=q.getAnswers();  
        Iterator<Answer> itr2=list2.iterator();  
       while(itr2.hasNext())
       {
        Answer a=itr2.next();
            System.out.println(a.getAnswername()+":"+a.getPostedBy());
        }  
    }
    session.close();  
    System.out.println("success");  
}  
}  