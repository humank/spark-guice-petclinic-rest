/*
 * Copyright 2016-2018 the original author or authors.
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

//@RestController
//@CrossOrigin(exposedHeaders = "errors, content-type")
//@RequestMapping("api/vets")
public class VetRestController {

//	@Autowired
//	private ClinicService clinicService;
//
//	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public ResponseEntity<Collection<Vet>> getAllVets(){
//		Collection<Vet> vets = new ArrayList<Vet>();
//		vets.addAll(this.clinicService.findAllVets());
//		if (vets.isEmpty()){
//			return new ResponseEntity<Collection<Vet>>(HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Collection<Vet>>(vets, HttpStatus.OK);
//	}
//
//	@RequestMapping(value = "/{vetId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public ResponseEntity<Vet> getVet(@PathVariable("vetId") int vetId){
//		Vet vet = this.clinicService.findVetById(vetId);
//		if(vet == null){
//			return new ResponseEntity<Vet>(HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<Vet>(vet, HttpStatus.OK);
//	}
//
//
//	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public ResponseEntity<Vet> addVet(@RequestBody @Valid Vet vet, BindingResult bindingResult, UriComponentsBuilder ucBuilder){
//		BindingErrorsResponse errors = new BindingErrorsResponse();
//		HttpHeaders headers = new HttpHeaders();
//		if(bindingResult.hasErrors() || (vet == null)){
//			errors.addAllErrors(bindingResult);
//			headers.add("errors", errors.toJSON());
//			return new ResponseEntity<Vet>(headers, HttpStatus.BAD_REQUEST);
//		}
//		this.clinicService.saveVet(vet);
//		headers.setLocation(ucBuilder.path("/api/vets/{id}").buildAndExpand(vet.getId()).toUri());
//		return new ResponseEntity<Vet>(vet, headers, HttpStatus.CREATED);
//	}
//
//	@RequestMapping(value = "/{vetId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	public ResponseEntity<Vet> updateVet(@PathVariable("vetId") int vetId, @RequestBody @Valid Vet vet, BindingResult bindingResult){
//		BindingErrorsResponse errors = new BindingErrorsResponse();
//		HttpHeaders headers = new HttpHeaders();
//		if(bindingResult.hasErrors() || (vet == null)){
//			errors.addAllErrors(bindingResult);
//			headers.add("errors", errors.toJSON());
//			return new ResponseEntity<Vet>(headers, HttpStatus.BAD_REQUEST);
//		}
//		Vet currentVet = this.clinicService.findVetById(vetId);
//		if(currentVet == null){
//			return new ResponseEntity<Vet>(HttpStatus.NOT_FOUND);
//		}
//		currentVet.setFirstName(vet.getFirstName());
//		currentVet.setLastName(vet.getLastName());
//		currentVet.clearSpecialties();
//		for(Specialty spec : vet.getSpecialties()) {
//			currentVet.addSpecialty(spec);
//		}
//		this.clinicService.saveVet(currentVet);
//		return new ResponseEntity<Vet>(currentVet, HttpStatus.NO_CONTENT);
//	}
//
//	@RequestMapping(value = "/{vetId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//	@Transactional
//	public ResponseEntity<Void> deleteVet(@PathVariable("vetId") int vetId){
//		Vet vet = this.clinicService.findVetById(vetId);
//		if(vet == null){
//			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
//		}
//		this.clinicService.deleteVet(vet);
//		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//	}
//


}
