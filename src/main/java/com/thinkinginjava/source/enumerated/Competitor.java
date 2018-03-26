//: enumerated/Competitor.java
// Switching one enum on another.
package com.thinkinginjava.source.enumerated;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
