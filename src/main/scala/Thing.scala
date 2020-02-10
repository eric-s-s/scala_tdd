case class Thing(num: Int) {
  def add(new_num: Int): Thing = {
    Thing(num + new_num)
  }
}
