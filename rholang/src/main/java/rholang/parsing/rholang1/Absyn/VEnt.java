package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class VEnt extends Value {
  public final Entity entity_;
  public VEnt(Entity p1) { entity_ = p1; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.VEnt) {
      rholang.parsing.rholang1.Absyn.VEnt x = (rholang.parsing.rholang1.Absyn.VEnt)o;
      return this.entity_.equals(x.entity_);
    }
    return false;
  }

  public int hashCode() {
    return this.entity_.hashCode();
  }


}