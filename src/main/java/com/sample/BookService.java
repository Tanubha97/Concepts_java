package com.sample;

import com.sample.model.BooksType;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public List getAvailableBooks(BooksType type){
        List bname = new ArrayList();

        if(type.equals(BooksType.CPP)){
            bname.add("Effective Modern C++");
            bname.add("More Effective C++");
        }else if (type.equals(BooksType.JAVA)){
            bname.add("The Complete Reference Java");
            bname.add("Programming with Java");
        }else if (type.equals(BooksType.PYTHON)){
            bname.add("Programming with Python");
        }else if (type.equals(BooksType.GOLANG)){
            bname.add("Introducing GO");
            bname.add("Head First Go");
        }else {
            bname.add("NO Books are available under this criteria");
        }
        return bname;
    }
}
