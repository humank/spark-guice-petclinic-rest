/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package solid.humank.serverlesslabs.rest;

/**
 * @author Vitaliy Fedoriv
 *
 */

//@ControllerAdvice
public class ExceptionControllerAdvice {

    //disable spring framework usage.

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<String> exception(Exception e) {
//		ObjectMapper mapper = new ObjectMapper();
//		ErrorInfo errorInfo = new ErrorInfo(e);
//		String respJSONstring = "{}";
//		try {
//			respJSONstring = mapper.writeValueAsString(errorInfo);
//		} catch (JsonProcessingException e1) {
//			e1.printStackTrace();
//		}
//		return ResponseEntity.badRequest().body(respJSONstring);
//	}

	private class ErrorInfo {
	    public final String className;
	    public final String exMessage;

	    public ErrorInfo(Exception ex) {
	        this.className = ex.getClass().getName();
	        this.exMessage = ex.getLocalizedMessage();
	    }
	}
}
