import unittest
from testAllpom import TestHome
from testAllpom import TestAbout
from concurrencytest import ConcurrentTestSuite, fork_for_tests


def suite():
    suite = unittest.TestSuite()
    # Home page tests
    suite.addTest(TestHome('test_TC001_py3_doc_button'))
    suite.addTest(TestHome('test_TC002_blahblah_search'))
    suite.addTest(TestHome('test_TC004_assert_title'))

    #About page
    suite.addTest(TestAbout('test_TC003_verify_upcoming_events_section_present'))
    suite.addTest(TestAbout('test_TC005_assert_url'))

    return suite

if __name__ == '__main__':
    runner = unittest.TextTestRunner(verbosity = 2)
    concurrent_suit = ConcurrentTestSuite(suite, fork_for_tests(2))
    suite = suite()
    runner.run(concurrent_suit)

























