package com.epam.mjc;

public class noStudentWithThisIDException extends IllegalArgumentException
{
  noStudentWithThisIDException(String msg)
  {
      super(msg);
  }
  noStudentWithThisIDException(String msg, Throwable ex)
  {
      super(msg, ex);
  }

}
