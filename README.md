<img align="right" width="40%" src="https://www.finos.org/hubfs/FINOS/finos-logo/FINOS_Icon_Wordmark_Name_RGB_horizontal.png">

# API Generator

This is some super-alpha POC code to generate FDC3 apis (well, the `open` method) from OpenAPI.

## Java

run `mvn install`

Generates some java code like: 

```java
 */
@Path("/")
public interface DefaultApi  {

    /**
     * Opens an FDC3 App
     *
     */
    @POST
    @Path("/open/{appId}")
    @Consumes({ "application/json" })
    @Operation(summary = "Opens an FDC3 App", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK") })
    public void open(Context body, @PathParam("appId") String appId);
}
```

## Typescript

Use `openapi-typescript`

```
sudo npm i --location=global openapi-typescript
```

Generates:

```typescript

export class DefaultService {

    /**
     * Opens an FDC3 App
     * @param appId
     * @param requestBody Optional description in *Markdown*
     * @returns any OK
     * @throws ApiError
     */
    public static open(
        appId: string,
        requestBody: Context,
    ): CancelablePromise<any> {
        return __request(OpenAPI, {
            method: 'POST',
            url: '/open/{appId}',
            path: {
                'appId': appId,
            },
            body: requestBody,
            mediaType: 'application/json',
        });
    }

}


```



## .net

Something like:

```
sudo openapi-generator-cli generate -i src/main/resources/openapi/desktop-agent.yaml -g aspnetcore -o "target/generated-sources/swagger/DesktopAgent.web" --package-name DesktopAgent.web
```

Generates:

```.net
namespace DesktopAgent.web.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// Opens an FDC3 App
        /// </summary>
        /// <param name="appId"></param>
        /// <param name="context">Optional description in *Markdown*</param>
        /// <response code="200">OK</response>
        [HttpPost]
        [Route("/open/{appId}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("Open")]
        public virtual IActionResult Open([FromRoute (Name = "appId")][Required]string appId, [FromBody]Context context)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }
    }
}
```

## License

Copyright 2019 Fintech Open Source Foundation

Distributed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).

SPDX-License-Identifier: [Apache-2.0](https://spdx.org/licenses/Apache-2.0)
