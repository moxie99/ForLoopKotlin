fun main () {

    var tonyo = Profile("Tonyo", 30, "Android", )
    var segun = Profile("Oluwasegun", 30, "Java")
    var smith = Profile("Smith", 26, "DotNet")


    var decagonStudents = arrayOf(tonyo, segun, smith)

    for(i in decagonStudents){

        println(i.firstName)

    }

    for(i in decagonStudents.indices){

        println(decagonStudents[i].age)

}

    for(i in 0 ..decagonStudents.size - 1){

        println(decagonStudents.get(i).firstName)
    }

    for(i in 2 downTo 0){

    }

    for(i in decagonStudents.lastIndex downTo  0){


    }

    decagonStudents.forEach {
        println(it.stack)
    }

    decagonStudents.forEachIndexed { index, profile ->
        println(decagonStudents[index].firstName)
        println(profile.age)
    }

    var arr = arrayOf(1,2,3,4,5,6,7,8,9,11,22)

    for(i in 0.. arr.lastIndex step 2){
        println(arr[i])
    }

}