fun main() {
    val likes = 111
    val ending = if (likes % 100 == 1 ||  likes % 100 == 21 ||  likes % 100 == 31 ||  likes % 100 == 41 ||  likes % 100 == 51 ||  likes % 100 == 61 ||  likes % 100 == 71 || likes % 100 ==  81 ||  likes % 100 == 91) "человеку" else "людям"
    print("Понравилось $likes $ending")
}