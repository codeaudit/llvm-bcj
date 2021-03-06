/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 University of Manchester
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package uk.ac.man.cs.llvm.ir.module.records;

public enum FunctionRecord {
    UNUSED_0,
    DECLAREBLOCKS,
    BINOP,
    CAST,
    GEP_OLD,
    SELECT,
    EXTRACTELT,
    INSERTELT,
    SHUFFLEVEC,
    CMP,
    RET,
    BR,
    SWITCH,
    INVOKE,
    UNUSED_14,
    UNREACHABLE,
    PHI,
    UNUSED_17,
    UNUSED_18,
    ALLOCA,
    LOAD,
    UNUSED_21,
    UNUSED_22,
    VAARG,
    STORE_OLD,
    UNUSED_25,
    EXTRACTVAL,
    INSERTVAL,
    CMP2,
    VSELECT,
    INBOUNDS_GEP_OLD,
    INDIRECTBR,
    UNUSED_32,
    FUNC_CODE_DEBUG_LOC_AGAIN,
    CALL,
    FUNC_CODE_DEBUG_LOC,
    FENCE,
    CMPXCHG_OLD,
    ATOMICRMW,
    RESUME,
    LANDINGPAD_OLD,
    LOADATOMIC,
    STOREATOMIC_OLD,
    GEP,
    STORE,
    STOREATOMIC,
    CMPXCHG,
    LANDINGPAD,
    CLEANUPRET,
    CATCHRET,
    CATCHPAD,
    CLEANUPPAD,
    CATCHSWITCH,
    UNUSED_53,
    UNUSED_54,
    FUNC_CODE_OPERAND_BUNDLE;

    public static FunctionRecord decode(long id) {
        return values()[(int) id];
    }
}
