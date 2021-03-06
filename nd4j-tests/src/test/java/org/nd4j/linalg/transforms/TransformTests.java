/*
 *
 *  * Copyright 2015 Skymind,Inc.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 *
 */

package org.nd4j.linalg.transforms;

import org.junit.Test;
import org.nd4j.linalg.BaseNd4jTest;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;
import org.nd4j.linalg.factory.Nd4jBackend;
import org.nd4j.linalg.ops.transforms.Transforms;

import static org.junit.Assert.assertEquals;


/**
 * Created by agibsonccc on 9/6/14.
 */
public  class TransformTests extends BaseNd4jTest {

    public TransformTests(String name) {
        super(name);
    }

    public TransformTests() {
    }

    public TransformTests(Nd4jBackend backend) {
        super(backend);
    }

    public TransformTests(String name, Nd4jBackend backend) {
        super(name, backend);
    }



    @Test
    public void testPow() {
        INDArray twos = Nd4j.valueArrayOf(2, 2);
        INDArray pow = Transforms.pow(twos, 2);
        assertEquals(Nd4j.valueArrayOf(2, 4), pow);
    }


}
