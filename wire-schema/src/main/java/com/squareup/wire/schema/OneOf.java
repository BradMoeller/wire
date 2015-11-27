/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire.schema;

import com.google.common.collect.ImmutableList;
import com.squareup.wire.schema.internal.parser.OneOfElement;

public final class OneOf {
  private final OneOfElement element;
  private final ImmutableList<Field> fields;

  public OneOf(OneOfElement element, ImmutableList<Field> fields) {
    this.element = element;
    this.fields = fields;
  }

  public String name() {
    return element.name();
  }

  public String documentation() {
    return element.documentation();
  }

  public ImmutableList<Field> fields() {
    return fields;
  }

  void link(Linker linker) {
    for (Field field : fields) {
      field.link(linker);
    }
  }

  void linkOptions(Linker linker) {
    for (Field field : fields) {
      field.linkOptions(linker);
    }
  }

  OneOf retainAll(Schema schema, MarkSet markSet, ProtoType enclosingType) {
    ImmutableList<Field> retainedFields = Field.retainAll(schema, markSet, enclosingType, fields);
    if (retainedFields.isEmpty()) return null;
    return new OneOf(element, retainedFields);
  }
}
