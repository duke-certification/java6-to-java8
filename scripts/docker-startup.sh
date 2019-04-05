#!/bin/sh
book_name=java6-to-java8.asc
logs=output/ebook.log

version=0.1.0
revdate=$(date '+%Y-%m-%d')
params="--attribute revnumber=$version --attribute revdate=$revdate"

mkdir -p output

printf "\n--------------------------------------------------------\n" >> $logs
printf "$(date '+%Y-%m-%d %H:%M:%S') ---------- Exporting book formats...\n" >> $logs

printf "Converting to HTML...\n"
asciidoctor $params $book_name >> $logs
printf " -- HTML output at java6-to-java8.html\n"

printf "Converting to EPub...\n"
asciidoctor-epub3 $params $book_name >> $logs
printf " -- Epub output at java6-to-java8.epub\n"

printf "Converting to Mobi (kf8)...\n"
asciidoctor-epub3 $params -a ebook-format=kf8 $book_name >> $logs
printf " -- Mobi output at java6-to-java8.mobi\n"

printf "Converting to PDF... (this one takes a while)\n"
asciidoctor-pdf $params $book_name 2>/dev/null >> $logs
printf " -- PDF  output at java6-to-java8.pdf\n"
