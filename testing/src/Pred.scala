class Pred(n: Nat) extends Nat{
	def isZero: Boolean = {false}
	def predecessor: Nat = new Pred(this)
	def successor: Nat = new Succ(this)
	def +(that: Nat): Nat = new Pred(this) + new Succ(this)
	def -(that: Nat): Nat = new Succ(this) + new Pred(this)
}