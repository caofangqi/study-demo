#  模板方法模式 template-method-pattern

# 意图 Intent 
Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。





# 使用场景

* 有多个子类共有的方法,且逻辑相同.
* 重要的，复杂的方法，可以考虑作为模板方法。