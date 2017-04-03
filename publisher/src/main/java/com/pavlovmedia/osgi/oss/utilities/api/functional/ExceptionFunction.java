/*
 * Copyright 2016 Pavlov Media
 * 
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
 */
package com.pavlovmedia.osgi.oss.utilities.api.functional;

/**
 * Simplistic version of Function that can throw an exception.
 * Note, it does not add all the default methods.
 * 
 * @author Shawn Dempsay {@literal <sdempsay@pavlovmedia.com>}
 *
 * @param <T> Input to apply
 * @param <R> Return from apply
 * @param <E> Exception that can be thrown
 */
@FunctionalInterface
public interface ExceptionFunction<T, R, E extends Throwable> {
    R apply(T t) throws E;
}