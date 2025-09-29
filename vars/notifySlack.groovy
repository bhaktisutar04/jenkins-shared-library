def call(String status) {
    def template = libraryResource 'message.txt'
    template = template.replace('${STATUS}', status)
    echo template
}
