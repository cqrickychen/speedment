/**
 *
 * Copyright (c) 2006-2017, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.runtime.config.mutator;


import com.speedment.runtime.config.IndexColumn;
import com.speedment.runtime.config.mutator.trait.HasNameMutator;
import com.speedment.runtime.config.mutator.trait.HasOrderTypeMutator;
import com.speedment.runtime.config.mutator.trait.HasOrdinalPositionMutator;

/**
 *
 * @author       Per Minborg
 * @param <DOC>  document type
 */

public class IndexColumnMutator<DOC extends IndexColumn> extends DocumentMutatorImpl<DOC> implements 
        HasNameMutator<DOC>,
        HasOrdinalPositionMutator<DOC>, 
        HasOrderTypeMutator<DOC> {

    public IndexColumnMutator(DOC indexColumn) {
        super(indexColumn);
    }
}