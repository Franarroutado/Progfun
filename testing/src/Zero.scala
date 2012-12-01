object Zero extends Nat {
  def isZero: Boolean = {true}
  def predecessor: Nat = {throw new Exception }
  def successor: Nat = {new Succ(this)}
  def +(that: Nat): Nat = {that}
  def -(that: Nat): Nat = {throw new Exception}
}