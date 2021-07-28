import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object HelloWorld extends ScalaModule {
    def scalaVersion = "2.13.0"

    def ivyDeps = Agg(
        ivy"org.springframework.boot:spring-boot-starter-web:2.4.5"
    )
}
