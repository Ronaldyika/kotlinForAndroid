package com.example.editapp.KotlinPrograming

fun appData(){
    var StudentData = Pair<String,Int>("Ronald",3)
    print(StudentData.first);
    print(StudentData.second);
    var name = "Ronald"
    var age = 5;
    var marks = 5.5F
    var thripleData = Triple<String,Int,Float>(name,age,marks)

    println("my name is $name and i am  $age years old with $marks in chemistry")
}
