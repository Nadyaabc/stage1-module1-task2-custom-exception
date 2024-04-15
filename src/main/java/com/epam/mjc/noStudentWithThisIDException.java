package com.epam.mjc;

public class noStudentWithThisIDException extends IllegalArgumentException
{
  noStudentWithThisIDException(long ID)
  {
      super("Could not find student with ID " + ID);
  }
}
