package org.springframework.ai.model;

/**
 * This interface provides methods to access the main output of the AI model and the
 * metadata associated with this result. It is designed to offer a standardized and
 * comprehensive way to handle and interpret the outputs generated by AI models, catering
 * to diverse AI applications and use cases.
 *
 * @param <T> the type of the output generated by the AI model
 * @author Mark Pollack
 * @since 0.8.0
 */
public interface ModelResult<T> {

	/**
	 * Retrieves the output generated by the AI model.
	 * @return the output generated by the AI model
	 */
	T getOutput();

	/**
	 * Retrieves the metadata associated with the result of an AI model.
	 * @return the metadata associated with the result
	 */
	ResultMetadata getResultMetadata();

}
