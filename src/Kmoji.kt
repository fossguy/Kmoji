/*
 * Copyright 2019 fossguy (https://github.com/fossguy)
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

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Provide an emoji you want to search for...")
        return
    }

    val emoji = args[0]
    println(emoji)

    insertEmojis("file.txt")
    findEmoji(emoji)
}

fun findEmoji(emoji: String) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}


fun insertEmojis(file: String): List<Emoji> {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

data class Emoji(
    val emoji: String,
    val code: String,
    val description: String,
    val aliases: List<String>,
    val tags: List<String>
)
