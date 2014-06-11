case class test(st: String) {
    def printMe(st)
}

(for {
    a <- test('hello')
    b <- test('byebye')
} yield a).printMe