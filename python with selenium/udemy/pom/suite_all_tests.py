
import unittest
from pom.testAllpom import TestHome
from pom.testAllpom import TestAbout


def suite():
    suite = unittest.TestSuite()
    # Home page tests
    # Example: suite.addTest(TestCaseClass('tc_name'))
    suite.addTest(TestHome('test_TC001_py3_doc_button'))
    suite.addTest(TestHome('test_TC002_blahblah_search'))
    suite.addTest(TestHome('test_TC004_assert_title'))

    #About page
    suite.addTest(TestAbout('test_TC003_verify_upcoming_events_section_present'))
    suite.addTest(TestAbout('test_TC005_assert_url'))

    # About page tests
    return suite

if __name__ == '__main__':
    runner = unittest.TextTestRunner(verbosity = 2)
    suite = suite()
    runner.run(suite)



