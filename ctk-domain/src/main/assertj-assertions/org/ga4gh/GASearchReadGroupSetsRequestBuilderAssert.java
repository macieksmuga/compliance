package org.ga4gh;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link GASearchReadGroupSetsRequest.Builder} specific assertions - Generated by CustomAssertionGenerator.
 */
public class GASearchReadGroupSetsRequestBuilderAssert extends AbstractAssert<GASearchReadGroupSetsRequestBuilderAssert, GASearchReadGroupSetsRequest.Builder> {

  /**
   * Creates a new <code>{@link GASearchReadGroupSetsRequestBuilderAssert}</code> to make assertions on actual GASearchReadGroupSetsRequest.Builder.
   * @param actual the GASearchReadGroupSetsRequest.Builder we want to make assertions on.
   */
  public GASearchReadGroupSetsRequestBuilderAssert(GASearchReadGroupSetsRequest.Builder actual) {
    super(actual, GASearchReadGroupSetsRequestBuilderAssert.class);
  }

  /**
   * An entry point for GASearchReadGroupSetsRequestBuilderAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myGASearchReadGroupSetsRequest.Builder)</code> and get specific assertion with code completion.
   * @param actual the GASearchReadGroupSetsRequest.Builder we want to make assertions on.
   * @return a new <code>{@link GASearchReadGroupSetsRequestBuilderAssert}</code>
   */
  public static GASearchReadGroupSetsRequestBuilderAssert assertThat(GASearchReadGroupSetsRequest.Builder actual) {
    return new GASearchReadGroupSetsRequestBuilderAssert(actual);
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder's datasetIds contains the given String elements.
   * @param datasetIds the given elements that should be contained in actual GASearchReadGroupSetsRequest.Builder's datasetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual GASearchReadGroupSetsRequest.Builder's datasetIds does not contain all given String elements.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasDatasetIds(String... datasetIds) {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (datasetIds == null) failWithMessage("Expecting datasetIds parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getDatasetIds(), datasetIds);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder's datasetIds contains <b>only<b> the given String elements and nothing else in whatever order.
   * @param datasetIds the given elements that should be contained in actual GASearchReadGroupSetsRequest.Builder's datasetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual GASearchReadGroupSetsRequest.Builder's datasetIds does not contain all given String elements.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasOnlyDatasetIds(String... datasetIds) {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (datasetIds == null) failWithMessage("Expecting datasetIds parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getDatasetIds(), datasetIds);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder's datasetIds does not contain the given String elements.
   *
   * @param datasetIds the given elements that should not be in actual GASearchReadGroupSetsRequest.Builder's datasetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual GASearchReadGroupSetsRequest.Builder's datasetIds contains any given String elements.
   */
  public GASearchReadGroupSetsRequestBuilderAssert doesNotHaveDatasetIds(String... datasetIds) {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (datasetIds == null) failWithMessage("Expecting datasetIds parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getDatasetIds(), datasetIds);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder has no datasetIds.
   * @return this assertion object.
   * @throws AssertionError if the actual GASearchReadGroupSetsRequest.Builder's datasetIds is not empty.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasNoDatasetIds() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have datasetIds but had :\n  <%s>";
    
    // check
    if (actual.getDatasetIds().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getDatasetIds());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder's name is equal to the given one.
   * @param name the given name to compare the actual GASearchReadGroupSetsRequest.Builder's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder's name is not equal to the given one.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasName(String name) {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder's pageSize is equal to the given one.
   * @param pageSize the given pageSize to compare the actual GASearchReadGroupSetsRequest.Builder's pageSize to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder's pageSize is not equal to the given one.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasPageSize(Integer pageSize) {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pageSize of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Integer actualPageSize = actual.getPageSize();
    if (!Objects.areEqual(actualPageSize, pageSize)) {
      failWithMessage(assertjErrorMessage, actual, pageSize, actualPageSize);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder's pageToken is equal to the given one.
   * @param pageToken the given pageToken to compare the actual GASearchReadGroupSetsRequest.Builder's pageToken to.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder's pageToken is not equal to the given one.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasPageToken(String pageToken) {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pageToken of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualPageToken = actual.getPageToken();
    if (!Objects.areEqual(actualPageToken, pageToken)) {
      failWithMessage(assertjErrorMessage, actual, pageToken, actualPageToken);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder has dataset ids.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder does not have dataset ids.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasDatasetIds() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasDatasetIds()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder has dataset ids but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder does not have dataset ids.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder has dataset ids.
   */
  public GASearchReadGroupSetsRequestBuilderAssert doesNotHaveDatasetIds() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasDatasetIds()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder does not have dataset ids but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder has name.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder does not have name.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasName() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasName()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder has name but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder does not have name.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder has name.
   */
  public GASearchReadGroupSetsRequestBuilderAssert doesNotHaveName() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasName()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder does not have name but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder has page size.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder does not have page size.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasPageSize() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasPageSize()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder has page size but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder does not have page size.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder has page size.
   */
  public GASearchReadGroupSetsRequestBuilderAssert doesNotHavePageSize() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasPageSize()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder does not have page size but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder has page token.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder does not have page token.
   */
  public GASearchReadGroupSetsRequestBuilderAssert hasPageToken() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.hasPageToken()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder has page token but does not have.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual GASearchReadGroupSetsRequest.Builder does not have page token.
   * @return this assertion object.
   * @throws AssertionError - if the actual GASearchReadGroupSetsRequest.Builder has page token.
   */
  public GASearchReadGroupSetsRequestBuilderAssert doesNotHavePageToken() {
    // check that actual GASearchReadGroupSetsRequest.Builder we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.hasPageToken()) {
      failWithMessage("\nExpecting that actual GASearchReadGroupSetsRequest.Builder does not have page token but has.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

}
