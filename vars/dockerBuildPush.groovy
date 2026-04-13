def call(String imageName) {
    echo "🚀 Building Docker Image: ${imageName}"

    bat "docker build -t ${imageName} ."

    echo "📤 Pushing Docker Image..."

    bat "docker push ${imageName}"
}