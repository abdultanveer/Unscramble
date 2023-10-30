package com.example.android.unscramble.designpatterns;
public interface Subject
{
 void Attach(Observer o);
 void Detach(Observer o);
 void Notify();
}
 
