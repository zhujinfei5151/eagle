/*
 * Copyright 2017 eagle.jfaster.org.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */
package eagle.jfaster.org.context;

import eagle.jfaster.org.config.annotation.Refer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangyanpeng on 2017/10/24.
 */
public class ReferContext {

    private static Map<ReferCacheKey,String> refer2Name = new HashMap<>();

    public static void register(Refer refer,Class<?> targetClass,String name){
        refer2Name.put(new ReferCacheKey(targetClass,refer),name);
    }

    public static String getName(Refer refer,Class<?> targetClass){
        return refer2Name.get(new ReferCacheKey(targetClass,refer));
    }

}
