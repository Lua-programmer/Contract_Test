import io.restassured.RestAssured
import io.restassured.module.jsv.JsonSchemaValidator
import io.restassured.module.jsv.JsonSchemaValidator.*
import org.apache.http.HttpStatus
import org.junit.jupiter.api.Test


class CharacterContract {

    @Test
    fun `should return a character valid`() {
        RestAssured.`when`()
            .get("https://rickandmortyapi.com/api/character")
            .then().statusCode(HttpStatus.SC_OK)
            .body(matchesJsonSchemaInClasspath("character_schema.json"))
    }
}