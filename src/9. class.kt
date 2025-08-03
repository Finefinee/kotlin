fun main() {
    var a = Person("박보영", 1990)
    var b = Person("test", 1000)
    var c = Person("lol", 1999)

    println("안녕하세요, ${a.birthYear}년생 ${a.name}입니다.")

}

class Person (var name: String, val birthYear: Int)