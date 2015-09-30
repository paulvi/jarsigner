/*
 * Copyright 2014-2015 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.pde.signer.util;

import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

/**
 * @author Jamling
 *         
 */
public class Utils {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
    
    public static boolean isEmpty(Text text) {
        return isEmpty(text.getText());
    }
    
    public static boolean isEmpty(Combo combo) {
        return isEmpty(combo.getText());
    }
}
