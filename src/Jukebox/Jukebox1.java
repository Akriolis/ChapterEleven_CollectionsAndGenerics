package Jukebox;

import java.util.Collections;
import java.util.List;

import MockSong.*;
import Compare.*;
import Songs.*;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();

        // Collections and Generics

        // if you want to write some temporary code that stands in for the real code,
        // you can write "mock" code, this is called mocking

        // diamond operator - new ArrayList<>();
        // it uses type inference to infer the type you need

        // generic type
        // with generics you can create type-safe collections which will contains only object by your choice

        // E for Elements, T for Type
        // E is just a stand-in for real type

        // in generics "extends" means "extends or implements"

        // Comparator
        // java.util.Comparator


    }


    public void go(){
        List<String> songList = MockSong.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

    }



}
