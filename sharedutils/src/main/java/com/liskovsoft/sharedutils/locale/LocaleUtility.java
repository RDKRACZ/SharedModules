package com.liskovsoft.sharedutils.locale;

import android.content.Context;
import android.os.Build;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/*
 * Copyright 2013 Phil Brown
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
 *
 *
 * Get Script name by Locale
 * <br>
 * @author Phil Brown
 * @since 9:47:09 AM Dec 20, 2013
 *
 */

/*
 * Additional info:
 * https://en.wikipedia.org/wiki/Writing_system
 * https://stackoverflow.com/questions/19153384/how-to-get-the-script-from-a-locale-object-on-android
 * https://docs.oracle.com/javase/7/docs/api/java/util/Locale.html#getScript()
 * http://unicode.org/iso15924/iso15924-codes.html
 *
 * Usage:
 * String script = LocaleUtilities.getScript(Locale.getDefault());
 * String script = LocaleUtilities.getScript(getDefaultLocale(myActivity));
 */
public class LocaleUtility {

    public static Map<String, Map<String, String>> scriptsByLocale = new HashMap<String, Map<String, String>>();

    public static Map<String, String> getScriptsMap(String... keyValuePairs) {
        Map<String, String> languages = new HashMap<String, String>();
        for (int i = 0; i < keyValuePairs.length; i += 2) {
            languages.put(keyValuePairs[i], keyValuePairs[i + 1]);
        }
        return languages;
    }

    static {
        scriptsByLocale.put("aa", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ab", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("abq", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("abr", getScriptsMap("", ""));
        scriptsByLocale.put("ace", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ach", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ada", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ady", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ae", getScriptsMap("", "Avst"));
        scriptsByLocale.put("af", getScriptsMap("", "Latn"));
        scriptsByLocale.put("agq", getScriptsMap("", "Latn"));
        scriptsByLocale.put("aii", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ain", getScriptsMap("", "Kana"));
        scriptsByLocale.put("ak", getScriptsMap("", "Latn"));
        scriptsByLocale.put("akk", getScriptsMap("", "Xsux"));
        scriptsByLocale.put("ale", getScriptsMap("", "Latn"));
        scriptsByLocale.put("alt", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("am", getScriptsMap("", "Ethi"));
        scriptsByLocale.put("amo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("an", getScriptsMap("", "Latn"));
        scriptsByLocale.put("anp", getScriptsMap("", "Deva"));
        scriptsByLocale.put("aoz", getScriptsMap("", ""));
        scriptsByLocale.put("ar", getScriptsMap("", "Arab", "IR", "Syrc"));
        scriptsByLocale.put("arc", getScriptsMap("", "Armi"));
        scriptsByLocale.put("arn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("arp", getScriptsMap("", "Latn"));
        scriptsByLocale.put("arw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("as", getScriptsMap("", "Beng"));
        scriptsByLocale.put("asa", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ast", getScriptsMap("", "Latn"));
        scriptsByLocale.put("atj", getScriptsMap("", ""));
        scriptsByLocale.put("av", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("awa", getScriptsMap("", "Deva"));
        scriptsByLocale.put("ay", getScriptsMap("", "Latn"));
        scriptsByLocale.put("az", getScriptsMap("", "Latn", "AZ", "Cyrl", "IR", "Arab"));
        scriptsByLocale.put("ba", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("bal", getScriptsMap("", "Arab", "IR", "Latn", "PK", "Latn"));
        scriptsByLocale.put("ban", getScriptsMap("", "Latn", "ID", "Bali"));
        scriptsByLocale.put("bap", getScriptsMap("", ""));
        scriptsByLocale.put("bas", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bax", getScriptsMap("", "Bamu"));
        scriptsByLocale.put("bbc", getScriptsMap("", "Latn", "ID", "Batk"));
        scriptsByLocale.put("bbj", getScriptsMap("", ""));
        scriptsByLocale.put("bci", getScriptsMap("", ""));
        scriptsByLocale.put("be", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("bej", getScriptsMap("", "Arab"));
        scriptsByLocale.put("bem", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bew", getScriptsMap("", ""));
        scriptsByLocale.put("bez", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bfd", getScriptsMap("", ""));
        scriptsByLocale.put("bfq", getScriptsMap("", "Taml"));
        scriptsByLocale.put("bft", getScriptsMap("", "Arab"));
        scriptsByLocale.put("bfy", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bg", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("bgc", getScriptsMap("", ""));
        scriptsByLocale.put("bgx", getScriptsMap("", ""));
        scriptsByLocale.put("bh", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bhb", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bhi", getScriptsMap("", ""));
        scriptsByLocale.put("bhk", getScriptsMap("", ""));
        scriptsByLocale.put("bho", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bik", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bin", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bjj", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bjn", getScriptsMap("", ""));
        scriptsByLocale.put("bkm", getScriptsMap("", ""));
        scriptsByLocale.put("bku", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bla", getScriptsMap("", "Latn"));
        scriptsByLocale.put("blt", getScriptsMap("", "Tavt"));
        scriptsByLocale.put("bm", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bmq", getScriptsMap("", ""));
        scriptsByLocale.put("bn", getScriptsMap("", "Beng"));
        scriptsByLocale.put("bo", getScriptsMap("", "Tibt"));
        scriptsByLocale.put("bqi", getScriptsMap("", ""));
        scriptsByLocale.put("bqv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("br", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bra", getScriptsMap("", "Deva"));
        scriptsByLocale.put("brh", getScriptsMap("", ""));
        scriptsByLocale.put("brx", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bs", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bss", getScriptsMap("", ""));
        scriptsByLocale.put("bto", getScriptsMap("", ""));
        scriptsByLocale.put("btv", getScriptsMap("", "Deva"));
        scriptsByLocale.put("bua", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("buc", getScriptsMap("", "Latn"));
        scriptsByLocale.put("bug", getScriptsMap("", "Latn", "ID", "Bugi"));
        scriptsByLocale.put("bum", getScriptsMap("", ""));
        scriptsByLocale.put("bvb", getScriptsMap("", ""));
        scriptsByLocale.put("bya", getScriptsMap("", "Latn"));
        scriptsByLocale.put("byn", getScriptsMap("", "Ethi"));
        scriptsByLocale.put("byv", getScriptsMap("", ""));
        scriptsByLocale.put("bze", getScriptsMap("", ""));
        scriptsByLocale.put("bzx", getScriptsMap("", ""));
        scriptsByLocale.put("ca", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cad", getScriptsMap("", "Latn"));
        scriptsByLocale.put("car", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cay", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cch", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ccp", getScriptsMap("", "Beng"));
        scriptsByLocale.put("ce", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ceb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cgg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ch", getScriptsMap("", "Latn"));
        scriptsByLocale.put("chk", getScriptsMap("", "Latn"));
        scriptsByLocale.put("chm", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("chn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cho", getScriptsMap("", "Latn"));
        scriptsByLocale.put("chp", getScriptsMap("", "Latn"));
        scriptsByLocale.put("chr", getScriptsMap("", "Cher"));
        scriptsByLocale.put("chy", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cja", getScriptsMap("", "Arab"));
        scriptsByLocale.put("cjm", getScriptsMap("", "Cham"));
        scriptsByLocale.put("cjs", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ckb", getScriptsMap("", "Arab"));
        scriptsByLocale.put("ckt", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("co", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cop", getScriptsMap("", "Arab"));
        scriptsByLocale.put("cpe", getScriptsMap("", "Latn"));
        scriptsByLocale.put("cr", getScriptsMap("", "Cans"));
        scriptsByLocale.put("crh", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("crj", getScriptsMap("", ""));
        scriptsByLocale.put("crk", getScriptsMap("", "Cans"));
        scriptsByLocale.put("crl", getScriptsMap("", ""));
        scriptsByLocale.put("crm", getScriptsMap("", ""));
        scriptsByLocale.put("crs", getScriptsMap("", ""));
        scriptsByLocale.put("cs", getScriptsMap("", "Latn"));
        scriptsByLocale.put("csb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("csw", getScriptsMap("", ""));
        scriptsByLocale.put("cu", getScriptsMap("", "Glag"));
        scriptsByLocale.put("cv", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("cy", getScriptsMap("", "Latn"));
        scriptsByLocale.put("da", getScriptsMap("", "Latn"));
        scriptsByLocale.put("daf", getScriptsMap("", ""));
        scriptsByLocale.put("dak", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dar", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("dav", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dcc", getScriptsMap("", ""));
        scriptsByLocale.put("de", getScriptsMap("", "Latn", "BR", "Runr", "KZ", "Runr", "US", "Runr"));
        scriptsByLocale.put("del", getScriptsMap("", "Latn"));
        scriptsByLocale.put("den", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dgr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("din", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dje", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dng", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("doi", getScriptsMap("", "Arab"));
        scriptsByLocale.put("dsb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dtm", getScriptsMap("", ""));
        scriptsByLocale.put("dua", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dv", getScriptsMap("", "Thaa"));
        scriptsByLocale.put("dyo", getScriptsMap("", "Arab"));
        scriptsByLocale.put("dyu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("dz", getScriptsMap("", "Tibt"));
        scriptsByLocale.put("ebu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ee", getScriptsMap("", "Latn"));
        scriptsByLocale.put("efi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("egy", getScriptsMap("", "Egyp"));
        scriptsByLocale.put("eka", getScriptsMap("", "Latn"));
        scriptsByLocale.put("eky", getScriptsMap("", "Kali"));
        scriptsByLocale.put("el", getScriptsMap("", "Grek"));
        scriptsByLocale.put("en", getScriptsMap("", "Latn"));
        scriptsByLocale.put("eo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("es", getScriptsMap("", "Latn"));
        scriptsByLocale.put("et", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ett", getScriptsMap("", "Ital"));
        scriptsByLocale.put("eu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("evn", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ewo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fa", getScriptsMap("", "Arab"));
        scriptsByLocale.put("fan", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ff", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ffm", getScriptsMap("", ""));
        scriptsByLocale.put("fi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fil", getScriptsMap("", "Latn", "US", "Tglg"));
        scriptsByLocale.put("fiu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fj", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fon", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("frr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("frs", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fud", getScriptsMap("", ""));
        scriptsByLocale.put("fuq", getScriptsMap("", ""));
        scriptsByLocale.put("fur", getScriptsMap("", "Latn"));
        scriptsByLocale.put("fuv", getScriptsMap("", ""));
        scriptsByLocale.put("fy", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ga", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gaa", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gag", getScriptsMap("", "Latn", "MD", "Cyrl"));
        scriptsByLocale.put("gay", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gba", getScriptsMap("", "Arab"));
        scriptsByLocale.put("gbm", getScriptsMap("", "Deva"));
        scriptsByLocale.put("gcr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gd", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gez", getScriptsMap("", "Ethi"));
        scriptsByLocale.put("ggn", getScriptsMap("", ""));
        scriptsByLocale.put("gil", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gjk", getScriptsMap("", ""));
        scriptsByLocale.put("gju", getScriptsMap("", ""));
        scriptsByLocale.put("gl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gld", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("glk", getScriptsMap("", ""));
        scriptsByLocale.put("gn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gon", getScriptsMap("", "Telu"));
        scriptsByLocale.put("gor", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gos", getScriptsMap("", ""));
        scriptsByLocale.put("got", getScriptsMap("", "Goth"));
        scriptsByLocale.put("grb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("grc", getScriptsMap("", "Cprt"));
        scriptsByLocale.put("grt", getScriptsMap("", "Beng"));
        scriptsByLocale.put("gsw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gu", getScriptsMap("", "Gujr"));
        scriptsByLocale.put("gub", getScriptsMap("", ""));
        scriptsByLocale.put("guz", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("gvr", getScriptsMap("", ""));
        scriptsByLocale.put("gwi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ha", getScriptsMap("", "Arab", "NE", "Latn", "GH", "Latn"));
        scriptsByLocale.put("hai", getScriptsMap("", "Latn"));
        scriptsByLocale.put("haw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("haz", getScriptsMap("", ""));
        scriptsByLocale.put("he", getScriptsMap("", "Hebr"));
        scriptsByLocale.put("hi", getScriptsMap("", "Deva"));
        scriptsByLocale.put("hil", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hit", getScriptsMap("", "Xsux"));
        scriptsByLocale.put("hmn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hnd", getScriptsMap("", ""));
        scriptsByLocale.put("hne", getScriptsMap("", "Deva"));
        scriptsByLocale.put("hnn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hno", getScriptsMap("", ""));
        scriptsByLocale.put("ho", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hoc", getScriptsMap("", "Deva"));
        scriptsByLocale.put("hoj", getScriptsMap("", "Deva"));
        scriptsByLocale.put("hop", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hsb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ht", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hup", getScriptsMap("", "Latn"));
        scriptsByLocale.put("hy", getScriptsMap("", "Armn"));
        scriptsByLocale.put("hz", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ia", getScriptsMap("", "Latn"));
        scriptsByLocale.put("iba", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ibb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("id", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ig", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ii", getScriptsMap("", "Yiii", "CN", "Latn"));
        scriptsByLocale.put("ik", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ikt", getScriptsMap("", ""));
        scriptsByLocale.put("ilo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("inh", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("is", getScriptsMap("", "Latn"));
        scriptsByLocale.put("it", getScriptsMap("", "Latn"));
        scriptsByLocale.put("iu", getScriptsMap("", "Cans", "CA", "Latn"));
        scriptsByLocale.put("ja", getScriptsMap("", "Jpan"));
        scriptsByLocale.put("jmc", getScriptsMap("", "Latn"));
        scriptsByLocale.put("jml", getScriptsMap("", ""));
        scriptsByLocale.put("jpr", getScriptsMap("", "Hebr"));
        scriptsByLocale.put("jrb", getScriptsMap("", "Hebr"));
        scriptsByLocale.put("jv", getScriptsMap("", "Latn", "ID", "Java"));
        scriptsByLocale.put("ka", getScriptsMap("", "Geor"));
        scriptsByLocale.put("kaa", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kab", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kac", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kaj", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kam", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kao", getScriptsMap("", ""));
        scriptsByLocale.put("kbd", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kca", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kcg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kck", getScriptsMap("", ""));
        scriptsByLocale.put("kde", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kdt", getScriptsMap("", "Thai"));
        scriptsByLocale.put("kea", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kfo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kfr", getScriptsMap("", "Deva"));
        scriptsByLocale.put("kfy", getScriptsMap("", ""));
        scriptsByLocale.put("kg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kge", getScriptsMap("", ""));
        scriptsByLocale.put("kgp", getScriptsMap("", ""));
        scriptsByLocale.put("kha", getScriptsMap("", "Latn", "IN", "Beng"));
        scriptsByLocale.put("khb", getScriptsMap("", "Talu"));
        scriptsByLocale.put("khn", getScriptsMap("", ""));
        scriptsByLocale.put("khq", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kht", getScriptsMap("", "Mymr"));
        scriptsByLocale.put("khw", getScriptsMap("", ""));
        scriptsByLocale.put("ki", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kj", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kjg", getScriptsMap("", ""));
        scriptsByLocale.put("kjh", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kk", getScriptsMap("", "Arab", "KZ", "Cyrl", "TR", "Cyrl"));
        scriptsByLocale.put("kkj", getScriptsMap("", ""));
        scriptsByLocale.put("kl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kln", getScriptsMap("", "Latn"));
        scriptsByLocale.put("km", getScriptsMap("", "Khmr"));
        scriptsByLocale.put("kmb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kn", getScriptsMap("", "Knda"));
        scriptsByLocale.put("ko", getScriptsMap("", "Kore"));
        scriptsByLocale.put("koi", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kok", getScriptsMap("", "Deva"));
        scriptsByLocale.put("kos", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kpe", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kpy", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("krc", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kri", getScriptsMap("", "Latn"));
        scriptsByLocale.put("krl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kru", getScriptsMap("", "Deva"));
        scriptsByLocale.put("ks", getScriptsMap("", "Arab"));
        scriptsByLocale.put("ksb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ksf", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ksh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ku", getScriptsMap("", "Latn", "LB", "Arab"));
        scriptsByLocale.put("kum", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kut", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kv", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("kvr", getScriptsMap("", ""));
        scriptsByLocale.put("kvx", getScriptsMap("", ""));
        scriptsByLocale.put("kw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("kxm", getScriptsMap("", ""));
        scriptsByLocale.put("kxp", getScriptsMap("", ""));
        scriptsByLocale.put("ky", getScriptsMap("", "Cyrl", "CN", "Arab", "TR", "Latn"));
        scriptsByLocale.put("kyu", getScriptsMap("", "Kali"));
        scriptsByLocale.put("la", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lad", getScriptsMap("", "Hebr"));
        scriptsByLocale.put("lag", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lah", getScriptsMap("", "Arab"));
        scriptsByLocale.put("laj", getScriptsMap("", ""));
        scriptsByLocale.put("lam", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lbe", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("lbw", getScriptsMap("", ""));
        scriptsByLocale.put("lcp", getScriptsMap("", "Thai"));
        scriptsByLocale.put("lep", getScriptsMap("", "Lepc"));
        scriptsByLocale.put("lez", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("lg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("li", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lif", getScriptsMap("", "Deva"));
        scriptsByLocale.put("lis", getScriptsMap("", "Lisu"));
        scriptsByLocale.put("ljp", getScriptsMap("", ""));
        scriptsByLocale.put("lki", getScriptsMap("", "Arab"));
        scriptsByLocale.put("lkt", getScriptsMap("", ""));
        scriptsByLocale.put("lmn", getScriptsMap("", "Telu"));
        scriptsByLocale.put("lmo", getScriptsMap("", ""));
        scriptsByLocale.put("ln", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lo", getScriptsMap("", "Laoo"));
        scriptsByLocale.put("lol", getScriptsMap("", "Latn"));
        scriptsByLocale.put("loz", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lrc", getScriptsMap("", ""));
        scriptsByLocale.put("lt", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lua", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lui", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lun", getScriptsMap("", "Latn"));
        scriptsByLocale.put("luo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lus", getScriptsMap("", "Beng"));
        scriptsByLocale.put("lut", getScriptsMap("", "Latn"));
        scriptsByLocale.put("luy", getScriptsMap("", "Latn"));
        scriptsByLocale.put("luz", getScriptsMap("", ""));
        scriptsByLocale.put("lv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("lwl", getScriptsMap("", "Thai"));
        scriptsByLocale.put("mad", getScriptsMap("", "Latn"));
        scriptsByLocale.put("maf", getScriptsMap("", ""));
        scriptsByLocale.put("mag", getScriptsMap("", "Deva"));
        scriptsByLocale.put("mai", getScriptsMap("", "Deva"));
        scriptsByLocale.put("mak", getScriptsMap("", "Latn", "ID", "Bugi"));
        scriptsByLocale.put("man", getScriptsMap("", "Latn", "GN", "Nkoo"));
        scriptsByLocale.put("mas", getScriptsMap("", "Latn"));
        scriptsByLocale.put("maz", getScriptsMap("", ""));
        scriptsByLocale.put("mdf", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("mdh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mdr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mdt", getScriptsMap("", ""));
        scriptsByLocale.put("men", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mer", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mfa", getScriptsMap("", ""));
        scriptsByLocale.put("mfe", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mgh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mgp", getScriptsMap("", ""));
        scriptsByLocale.put("mgy", getScriptsMap("", ""));
        scriptsByLocale.put("mh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mic", getScriptsMap("", "Latn"));
        scriptsByLocale.put("min", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mk", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ml", getScriptsMap("", "Mlym"));
        scriptsByLocale.put("mn", getScriptsMap("", "Cyrl", "CN", "Mong"));
        scriptsByLocale.put("mnc", getScriptsMap("", "Mong"));
        scriptsByLocale.put("mni", getScriptsMap("", "Beng", "IN", "Mtei"));
        scriptsByLocale.put("mns", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("mnw", getScriptsMap("", "Mymr"));
        scriptsByLocale.put("moe", getScriptsMap("", ""));
        scriptsByLocale.put("moh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mos", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mr", getScriptsMap("", "Deva"));
        scriptsByLocale.put("mrd", getScriptsMap("", ""));
        scriptsByLocale.put("mrj", getScriptsMap("", ""));
        scriptsByLocale.put("ms", getScriptsMap("", "Arab", "MY", "Latn", "SG", "Latn"));
        scriptsByLocale.put("mt", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mtr", getScriptsMap("", ""));
        scriptsByLocale.put("mua", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mus", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mvy", getScriptsMap("", ""));
        scriptsByLocale.put("mwk", getScriptsMap("", ""));
        scriptsByLocale.put("mwl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("mwr", getScriptsMap("", "Deva"));
        scriptsByLocale.put("mxc", getScriptsMap("", ""));
        scriptsByLocale.put("my", getScriptsMap("", "Mymr"));
        scriptsByLocale.put("myv", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("myx", getScriptsMap("", ""));
        scriptsByLocale.put("myz", getScriptsMap("", "Mand"));
        scriptsByLocale.put("na", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nap", getScriptsMap("", "Latn"));
        scriptsByLocale.put("naq", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nbf", getScriptsMap("", ""));
        scriptsByLocale.put("nch", getScriptsMap("", ""));
        scriptsByLocale.put("nd", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ndc", getScriptsMap("", ""));
        scriptsByLocale.put("nds", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ne", getScriptsMap("", "Deva"));
        scriptsByLocale.put("new", getScriptsMap("", "Deva"));
        scriptsByLocale.put("ng", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ngl", getScriptsMap("", ""));
        scriptsByLocale.put("nhe", getScriptsMap("", ""));
        scriptsByLocale.put("nhw", getScriptsMap("", ""));
        scriptsByLocale.put("nia", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nij", getScriptsMap("", ""));
        scriptsByLocale.put("niu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nmg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nnh", getScriptsMap("", ""));
        scriptsByLocale.put("nod", getScriptsMap("", "Lana"));
        scriptsByLocale.put("noe", getScriptsMap("", ""));
        scriptsByLocale.put("nog", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("nqo", getScriptsMap("", "Nkoo"));
        scriptsByLocale.put("nr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nsk", getScriptsMap("", ""));
        scriptsByLocale.put("nso", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nus", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ny", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nym", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nyn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nyo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("nzi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("oc", getScriptsMap("", "Latn"));
        scriptsByLocale.put("oj", getScriptsMap("", "Cans"));
        scriptsByLocale.put("om", getScriptsMap("", "Latn", "ET", "Ethi"));
        scriptsByLocale.put("or", getScriptsMap("", "Orya"));
        scriptsByLocale.put("os", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("osa", getScriptsMap("", "Latn"));
        scriptsByLocale.put("osc", getScriptsMap("", "Ital"));
        scriptsByLocale.put("otk", getScriptsMap("", "Orkh"));
        scriptsByLocale.put("pa", getScriptsMap("", "Guru", "PK", "Arab"));
        scriptsByLocale.put("pag", getScriptsMap("", "Latn"));
        scriptsByLocale.put("pal", getScriptsMap("", "Phli"));
        scriptsByLocale.put("pam", getScriptsMap("", "Latn"));
        scriptsByLocale.put("pap", getScriptsMap("", "Latn"));
        scriptsByLocale.put("pau", getScriptsMap("", "Latn"));
        scriptsByLocale.put("peo", getScriptsMap("", "Xpeo"));
        scriptsByLocale.put("phn", getScriptsMap("", "Phnx"));
        scriptsByLocale.put("pi", getScriptsMap("", "Deva"));
        scriptsByLocale.put("pko", getScriptsMap("", ""));
        scriptsByLocale.put("pl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("pon", getScriptsMap("", "Latn"));
        scriptsByLocale.put("pra", getScriptsMap("", "Brah"));
        scriptsByLocale.put("prd", getScriptsMap("", "Arab"));
        scriptsByLocale.put("prg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("prs", getScriptsMap("", "Arab"));
        scriptsByLocale.put("ps", getScriptsMap("", "Arab"));
        scriptsByLocale.put("pt", getScriptsMap("", "Latn"));
        scriptsByLocale.put("puu", getScriptsMap("", ""));
        scriptsByLocale.put("qu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("raj", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rap", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rar", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rcf", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rej", getScriptsMap("", "Latn", "ID", "Rjng"));
        scriptsByLocale.put("ria", getScriptsMap("", ""));
        scriptsByLocale.put("rif", getScriptsMap("", ""));
        scriptsByLocale.put("rjs", getScriptsMap("", "Deva"));
        scriptsByLocale.put("rkt", getScriptsMap("", "Beng"));
        scriptsByLocale.put("rm", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rmf", getScriptsMap("", ""));
        scriptsByLocale.put("rmo", getScriptsMap("", ""));
        scriptsByLocale.put("rmt", getScriptsMap("", ""));
        scriptsByLocale.put("rn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rng", getScriptsMap("", ""));
        scriptsByLocale.put("ro", getScriptsMap("", "Latn", "RS", "Cyrl"));
        scriptsByLocale.put("rob", getScriptsMap("", ""));
        scriptsByLocale.put("rof", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rom", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ru", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("rue", getScriptsMap("", ""));
        scriptsByLocale.put("rup", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("rwk", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ryu", getScriptsMap("", ""));
        scriptsByLocale.put("sa", getScriptsMap("", "Deva"));
        scriptsByLocale.put("sad", getScriptsMap("", "Latn"));
        scriptsByLocale.put("saf", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sah", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("sam", getScriptsMap("", "Hebr"));
        scriptsByLocale.put("saq", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sas", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sat", getScriptsMap("", "Latn"));
        scriptsByLocale.put("saz", getScriptsMap("", "Saur"));
        scriptsByLocale.put("sbp", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sc", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sck", getScriptsMap("", ""));
        scriptsByLocale.put("scn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sco", getScriptsMap("", "Latn"));
        scriptsByLocale.put("scs", getScriptsMap("", ""));
        scriptsByLocale.put("sd", getScriptsMap("", "Arab", "IN", "Deva"));
        scriptsByLocale.put("sdh", getScriptsMap("", "Arab"));
        scriptsByLocale.put("se", getScriptsMap("", "Latn", "NO", "Cyrl"));
        scriptsByLocale.put("see", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sef", getScriptsMap("", ""));
        scriptsByLocale.put("seh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sel", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ses", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sga", getScriptsMap("", "Latn"));
        scriptsByLocale.put("shi", getScriptsMap("", "Tfng"));
        scriptsByLocale.put("shn", getScriptsMap("", "Mymr"));
        scriptsByLocale.put("si", getScriptsMap("", "Sinh"));
        scriptsByLocale.put("sid", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sk", getScriptsMap("", "Latn"));
        scriptsByLocale.put("skr", getScriptsMap("", ""));
        scriptsByLocale.put("sl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sm", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sma", getScriptsMap("", "Latn"));
        scriptsByLocale.put("smi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("smj", getScriptsMap("", "Latn"));
        scriptsByLocale.put("smn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sms", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("snk", getScriptsMap("", "Latn"));
        scriptsByLocale.put("so", getScriptsMap("", "Latn"));
        scriptsByLocale.put("son", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sou", getScriptsMap("", ""));
        scriptsByLocale.put("sq", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("srn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("srr", getScriptsMap("", "Latn"));
        scriptsByLocale.put("srx", getScriptsMap("", ""));
        scriptsByLocale.put("ss", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ssy", getScriptsMap("", "Latn"));
        scriptsByLocale.put("st", getScriptsMap("", "Latn"));
        scriptsByLocale.put("su", getScriptsMap("", "Latn"));
        scriptsByLocale.put("suk", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sus", getScriptsMap("", "Latn", "GN", "Arab"));
        scriptsByLocale.put("sv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("sw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("swb", getScriptsMap("", "Arab", "YT", "Latn"));
        scriptsByLocale.put("swc", getScriptsMap("", "Latn"));
        scriptsByLocale.put("swv", getScriptsMap("", ""));
        scriptsByLocale.put("sxn", getScriptsMap("", ""));
        scriptsByLocale.put("syi", getScriptsMap("", ""));
        scriptsByLocale.put("syl", getScriptsMap("", "Beng", "BD", "Sylo"));
        scriptsByLocale.put("syr", getScriptsMap("", "Syrc"));
        scriptsByLocale.put("ta", getScriptsMap("", "Taml"));
        scriptsByLocale.put("tab", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("taj", getScriptsMap("", ""));
        scriptsByLocale.put("tbw", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tcy", getScriptsMap("", "Knda"));
        scriptsByLocale.put("tdd", getScriptsMap("", "Tale"));
        scriptsByLocale.put("tdg", getScriptsMap("", ""));
        scriptsByLocale.put("tdh", getScriptsMap("", ""));
        scriptsByLocale.put("te", getScriptsMap("", "Telu"));
        scriptsByLocale.put("tem", getScriptsMap("", "Latn"));
        scriptsByLocale.put("teo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ter", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tet", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tg", getScriptsMap("", "Cyrl", "PK", "Arab"));
        scriptsByLocale.put("th", getScriptsMap("", "Thai"));
        scriptsByLocale.put("thl", getScriptsMap("", ""));
        scriptsByLocale.put("thq", getScriptsMap("", ""));
        scriptsByLocale.put("thr", getScriptsMap("", ""));
        scriptsByLocale.put("ti", getScriptsMap("", "Ethi"));
        scriptsByLocale.put("tig", getScriptsMap("", "Ethi"));
        scriptsByLocale.put("tiv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tk", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tkl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tkt", getScriptsMap("", ""));
        scriptsByLocale.put("tli", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tmh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tn", getScriptsMap("", "Latn"));
        scriptsByLocale.put("to", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tog", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tpi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tr", getScriptsMap("", "Latn", "DE", "Arab", "MK", "Arab"));
        scriptsByLocale.put("tru", getScriptsMap("", "Latn"));
        scriptsByLocale.put("trv", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ts", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tsf", getScriptsMap("", ""));
        scriptsByLocale.put("tsg", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tsi", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tsj", getScriptsMap("", ""));
        scriptsByLocale.put("tt", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("ttj", getScriptsMap("", ""));
        scriptsByLocale.put("tts", getScriptsMap("", "Thai"));
        scriptsByLocale.put("tum", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tut", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("tvl", getScriptsMap("", "Latn"));
        scriptsByLocale.put("twq", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ty", getScriptsMap("", "Latn"));
        scriptsByLocale.put("tyv", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("tzm", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ude", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("udm", getScriptsMap("", "Cyrl", "RU", "Latn"));
        scriptsByLocale.put("ug", getScriptsMap("", "Arab", "KZ", "Cyrl", "MN", "Cyrl"));
        scriptsByLocale.put("uga", getScriptsMap("", "Ugar"));
        scriptsByLocale.put("uk", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("uli", getScriptsMap("", "Latn"));
        scriptsByLocale.put("umb", getScriptsMap("", "Latn"));
        scriptsByLocale.put("und", getScriptsMap("", ""));
        scriptsByLocale.put("unr", getScriptsMap("", "Beng", "NP", "Deva"));
        scriptsByLocale.put("unx", getScriptsMap("", "Beng"));
        scriptsByLocale.put("ur", getScriptsMap("", "Arab"));
        scriptsByLocale.put("uz", getScriptsMap("", "Latn", "AF", "Arab", "CN", "Cyrl"));
        scriptsByLocale.put("vai", getScriptsMap("", "Vaii"));
        scriptsByLocale.put("ve", getScriptsMap("", "Latn"));
        scriptsByLocale.put("vi", getScriptsMap("", "Latn", "US", "Hani"));
        scriptsByLocale.put("vic", getScriptsMap("", ""));
        scriptsByLocale.put("vmw", getScriptsMap("", ""));
        scriptsByLocale.put("vo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("vot", getScriptsMap("", "Latn"));
        scriptsByLocale.put("vun", getScriptsMap("", "Latn"));
        scriptsByLocale.put("wa", getScriptsMap("", "Latn"));
        scriptsByLocale.put("wae", getScriptsMap("", "Latn"));
        scriptsByLocale.put("wak", getScriptsMap("", "Latn"));
        scriptsByLocale.put("wal", getScriptsMap("", "Ethi"));
        scriptsByLocale.put("war", getScriptsMap("", "Latn"));
        scriptsByLocale.put("was", getScriptsMap("", "Latn"));
        scriptsByLocale.put("wbq", getScriptsMap("", ""));
        scriptsByLocale.put("wbr", getScriptsMap("", ""));
        scriptsByLocale.put("wls", getScriptsMap("", ""));
        scriptsByLocale.put("wo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("wtm", getScriptsMap("", ""));
        scriptsByLocale.put("xal", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("xav", getScriptsMap("", ""));
        scriptsByLocale.put("xcr", getScriptsMap("", "Cari"));
        scriptsByLocale.put("xh", getScriptsMap("", "Latn"));
        scriptsByLocale.put("xnr", getScriptsMap("", ""));
        scriptsByLocale.put("xog", getScriptsMap("", "Latn"));
        scriptsByLocale.put("xpr", getScriptsMap("", "Prti"));
        scriptsByLocale.put("xsa", getScriptsMap("", "Sarb"));
        scriptsByLocale.put("xsr", getScriptsMap("", "Deva"));
        scriptsByLocale.put("xum", getScriptsMap("", "Ital"));
        scriptsByLocale.put("yao", getScriptsMap("", "Latn"));
        scriptsByLocale.put("yap", getScriptsMap("", "Latn"));
        scriptsByLocale.put("yav", getScriptsMap("", "Latn"));
        scriptsByLocale.put("ybb", getScriptsMap("", ""));
        scriptsByLocale.put("yi", getScriptsMap("", "Hebr"));
        scriptsByLocale.put("yo", getScriptsMap("", "Latn"));
        scriptsByLocale.put("yrk", getScriptsMap("", "Cyrl"));
        scriptsByLocale.put("yua", getScriptsMap("", ""));
        scriptsByLocale.put("yue", getScriptsMap("", "Hans"));
        scriptsByLocale.put("za", getScriptsMap("", "Latn", "CN", "Hans"));
        scriptsByLocale.put("zap", getScriptsMap("", "Latn"));
        scriptsByLocale.put("zdj", getScriptsMap("", ""));
        scriptsByLocale.put("zea", getScriptsMap("", ""));
        scriptsByLocale.put("zen", getScriptsMap("", "Tfng"));
        scriptsByLocale.put("zh", getScriptsMap("", "Hant", "CN", "Hans", "HK", "Hans", "MO", "Hans", "SG", "Hans", "MN", "Hans"));
        scriptsByLocale.put("zmi", getScriptsMap("", ""));
        scriptsByLocale.put("zu", getScriptsMap("", "Latn"));
        scriptsByLocale.put("zun", getScriptsMap("", "Latn"));
        scriptsByLocale.put("zza", getScriptsMap("", "Arab"));
    }

    /**
     * Gets the script (writing type) for the given locale. For example, if a US citizen uses German Locale,
     * and calls this method with Locale.getDefault(), the result would be "Runr"
     *
     * @param locale
     * @return
     */
    public static String getScript(Locale locale) {
        String localeString = locale.toString();
        String language = "";
        String country = "";
        if (localeString.contains("_")) {
            String[] split = localeString.split("_");
            language = split[0];
            country = split[1];
        } else language = localeString;

        Map<String, String> scripts = scriptsByLocale.get(language);
        String script = scripts.get(country);
        return script == null ? scripts.get("") : script;

    }

    /**
     * Obtain right locale even if the user changes their Locale in settings after your application process is running.
     * Android N (Api level 24) update (no warnings).
     * @param context activity
     * @return locale
     */
    public static Locale getCurrentLocale(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            return context.getResources().getConfiguration().getLocales().get(0);
        } else{
            //noinspection deprecation
            return context.getResources().getConfiguration().locale;
        }
    }

    public static String getCurrentLanguage(Context context) {
        return getCurrentLocale(context).getLanguage().toLowerCase();
    }

    public static boolean is24HourLocale(Context context) {
        Locale currentLocale = LocaleUtility.getCurrentLocale(context);

        // Fix weird locale like en_RO
        for (Locale locale : Locale.getAvailableLocales()) {
            if (locale.getCountry().equals(currentLocale.getCountry())) {
                currentLocale = locale;
                break;
            }
        }

        java.text.DateFormat natural =
                java.text.DateFormat.getTimeInstance(
                        java.text.DateFormat.LONG, currentLocale);

        if (natural instanceof SimpleDateFormat) {
            SimpleDateFormat sdf = (SimpleDateFormat) natural;
            String pattern = sdf.toPattern();
            if (pattern.indexOf('H') >= 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
