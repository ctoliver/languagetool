/* LanguageTool, a natural language style checker
 * Copyright (C) 2020 Daniel Naber (http://www.danielnaber.de)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.rules.translation;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

/**
 * Entry of a translation dictionary.
 * @since 4.9
 */
public class TranslationEntry implements Comparable<TranslationEntry> {

  private final List<String> l1;
  private final List<String> l2;
  private final int itemCount;

  public TranslationEntry(List<String> l1, List<String> l2, int itemCount) {
    this.l1 = Objects.requireNonNull(l1);
    this.l2 = Objects.requireNonNull(l2);
    this.itemCount = itemCount;
  }

  public List<String> getL1() {
    return l1;
  }

  public List<String> getL2() {
    return l2;
  }

  @Override
  public String toString() {
    //return l1 + " -> " + l2 + " (itemCount: "+ itemCount + ")";
    return l1 + " -> " + l2;
  }

  @Override
  public int compareTo(@NotNull TranslationEntry o) {
    return Integer.compare(o.itemCount, itemCount);
  }

}
